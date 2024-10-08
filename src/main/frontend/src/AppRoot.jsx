import { useEffect, useState } from 'react';

function AppRoot() {
  const [data, setData] = useState({});

  useEffect(function () {
    console.log('useEffect startup');
    fetch('/api/v1/devotionals/daily')
      .then((response) => response.json())
      .then((json) => {
        setData(json.data);
      });
  }, []);

  return (
    <>
      <div>
        <h1>Daily Devotional</h1>
        <hr />
      </div>
      <div>
        <ul>
          <li>
            <img src={data.imagePath} />
          </li>
          <li>
            <p>{data.publishedAt}</p>
          </li>
          <li>
            <p>{data.quate}</p>
          </li>
          <li>
            <p>{data.content}</p>
          </li>
        </ul>
      </div>
    </>
  );
}

export default AppRoot;

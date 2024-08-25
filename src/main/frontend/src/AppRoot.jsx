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
      <div>AppRoot</div>
    </>
  );
}

export default AppRoot;

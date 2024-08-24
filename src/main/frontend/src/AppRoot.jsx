import { useEffect, useState } from 'react';

function AppRoot() {
  const [data, setData] = useState({}); // Initialize with an empty object

  useEffect(function () {
    fetch('/api/v1/devotionals/daily') // Add semicolon here
      .then((response) => response.json())
      .then((json) => {
        setData(json.data);
      });
  }, []); // Add an empty dependency array to run the effect only once

  return (
    <>
      <div>AppRoot</div>
    </>
  );
}

export default AppRoot;

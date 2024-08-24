import { useEffect, useState } from 'react';

function AppRoot() {
  const [data: {}, setData] = useState(initialState);
  useEffect(function () {
    fetch('/api/v1/devotionals/daily');
  });

  return (
    <>
      <div>AppRoot</div>
    </>
  );
}

export default AppRoot;

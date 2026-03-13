async function init() {
  try {
    const response = await fetch('https://jsonplaceholder.typicode.com/users');
    const user = await response.json();
    console.log(user);
  } catch (err) {
    console.log(err);
  }
}

init();

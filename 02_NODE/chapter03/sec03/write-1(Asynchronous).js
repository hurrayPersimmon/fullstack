const fs = require('fs');

fs.readFile('02_NODE/chapter03/sec03/example.txt', 'utf-8', (err, data) => {
  if (err) {
    console.error(err);
  }

  fs.writeFile('./text-2.txt', data, (err) => {
    if (err) {
      console.log(err);
    }
    console.log('save completed');
  });
});

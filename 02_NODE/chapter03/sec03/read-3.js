const fs = require('fs');
// const path = require('path');

fs.readFile('02_NODE/chapter03/sec03/example.txt', 'utf-8', (err, data) => {
  if (err) {
    console.error(err);
  }
  console.log(data);
});

// const filepath = path.join(__dirname, 'example.txt');

// fs.readFile(filepath, 'utf-8', (err, data) => {
//   if (err) {
//     console.error(err);
//   }
//   console.log(data);
// });

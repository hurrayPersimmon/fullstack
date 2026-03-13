const fs = require('fs');

fs.readdir('./', (err, files) => {
  if (err) {
    console.err(err);
    return;
  }
  console.log(files);
});

fs.readdir(__dirname, (err, files) => {
  if (err) {
    console.err(err);
    return;
  }
  console.log(files);
});

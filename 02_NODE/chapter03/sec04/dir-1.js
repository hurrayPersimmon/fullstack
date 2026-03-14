fs = require('fs');
const path = require('path');

const dirPath = path.join(__dirname, '/test');

if (fs.existsSync(dirPath)) {
  console.log('folder already exists');
} else {
  fs.mkdir(dirPath, (err) => {
    if (err) {
      return console.error(err);
    }
    console.log('folder created');
  });
}

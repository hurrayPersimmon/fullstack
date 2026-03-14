fs = require('fs');
const path = require('path');

const dirPath = path.join(__dirname, '/test2/test3/test4');

if (fs.existsSync(dirPath)) {
  console.log('folder already exists');
} else {
  fs.mkdir(dirPath, { recursive: true }, (err) => {
    if (err) {
      return console.error(err);
    }
    console.log('folder created');
  });
}

fs = require('fs');
const data = fs.readFileSync('02_NODE/chapter03/sec03/example.txt', 'utf8');

if (fs.existsSync('text-1.txt')) {
  console.log('file already exist');
} else {
  fs.writeFileSync('./text-1.txt', data);
}

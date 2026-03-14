fs = require('fs');
const data = fs.readFileSync('02_NODE/chapter03/sec03/example.txt', 'utf8');
fs.writeFileSync('./text-1.txt', data);

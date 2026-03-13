fs = require('fs');

//인코딩 미 지정시, 유니코드로 나타남.
const data = fs.readFileSync('02_NODE/chapter03/sec03/example.txt', 'utf-8'); // 인코딩 지정
console.log(data);

const path = require('path');

const fullPath = path.join('some', 'work', 'ex.txt');
console.log(fullPath);
console.log(`파일 절대 경로 : ${__filename}`);
console.log(`파일 이름 빼고 : ${path.dirname(__filename)}`);
console.log(`파일 이름 : ${path.basename(__dirname)}`);
console.log(`파일 이름(확장자 제외) :${path.basename(__dirname, '.js')}`);
console.log(`파일 확장자 : ${path.extname(__filename)}`);
console.log(path.parse(__filename));

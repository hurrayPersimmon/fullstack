const fs = require('fs');
const path = require('path');
const dirReadPath = path.join(__dirname, '/readMe.txt');
const dirWritePath = path.join(__dirname, '/writeMe.txt');

const rs = fs.createReadStream(dirReadPath);
const ws = fs.createWriteStream(dirWritePath);

rs.pipe(ws);

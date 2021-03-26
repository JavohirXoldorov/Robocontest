const fs = require('fs');
const data = fs.readFileSync('input.txt', 'utf8');
const [a,b] = data.split(' ').map(item => parseInt(item));
let result;
if(a === 0) {
  result = 1;
} else {
  result = 1+b;
}
fs.writeFileSync('output.txt', `${result}`, 'utf8');

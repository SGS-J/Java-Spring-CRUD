const http = require('http');
const fs = require('fs');

const app = http.createServer((req, res) => {
  fs.readFile('./index.html', (err, data) => {
    if (err) return res.end('Fatal error!');
    res.writeHead(200, { 'content-type': 'text/html' });
    return res.end(data);
  });
});

app.listen(3000, () => {
  console.log('Server listening on port 3000');
});

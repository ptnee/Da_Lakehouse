const express = require('express');
const path = require('path');

const app = express();
const port = 80;

// Đường dẫn đến thư mục chứa file index.html
const publicDirectoryPath = path.join(__dirname, '');

// Sử dụng index.html làm trang chủ
app.use(express.static(publicDirectoryPath));

// Định tuyến cho đường dẫn gốc '/'
app.get('/', (req, res) => {
    res.sendFile(path.join(publicDirectoryPath, 'index.html'));
});

app.listen(port, () => {
    console.log(`Server is running on port ${port}`);
});

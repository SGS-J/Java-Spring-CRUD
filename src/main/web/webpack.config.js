const path = require("path");

module.exports = {
    entry: path.join(__dirname, 'index.js'),
    cache: true,
    mode: 'development',
    output: {
        path: path.join(__dirname, "../resources/static/built"),
        filename: 'bundle.js',
        clean: true
    },
    module: {
        rules: [
            {
                test: path.join(__dirname, '.'),
                exclude: /(node_modules)/,
                use: [
                    {
                        loader: 'babel-loader',
                        options: {
                            presets: ["@babel/preset-env", "@babel/preset-react"]
                        }
                    }
                ]
            }
        ]
    }
}
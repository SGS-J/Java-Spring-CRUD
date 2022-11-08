const path = require("path");

module.exports = {
  entry: path.join(__dirname, "index.tsx"),
  cache: true,
  mode: "development",
  output: {
    path: path.join(__dirname, "../resources/static/built"),
    filename: "bundle.js",
    clean: true,
  },
  resolve: {
    extensions: [".tsx", ".ts", ".js"],
  },
  module: {
    rules: [
      {
        test: /\.(png|jpe?g|svg)$/,
        use: "file-loader",
      },
      {
        test: /\.(tsx?)$/i,
        exclude: /(node_modules)/,
        use: "ts-loader",
      },
      {
        test: /\.(scss)$/i,
        use: [
          {
            loader: "style-loader",
          },
          {
            loader: "css-loader",
          },
          {
            loader: "postcss-loader",
            options: {
              postcssOptions: {
                plugins: () => [require("autoprefixer")],
              },
            },
          },
          {
            loader: "sass-loader",
          },
        ],
      },
    ],
  },
};

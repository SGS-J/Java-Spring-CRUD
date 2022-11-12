import React from "react";
import { AssetLoader, AssetURL } from "../asset";
import MainBG from "./../public/assets/main-bg.jpg";

const Home = () => {
  const bgUrl: string = AssetLoader.readAsset(AssetURL.MAIN_BG);
  return (
    <div>
      <img src={bgUrl}></img>
      Main page
    </div>
  );
};

export default Home;

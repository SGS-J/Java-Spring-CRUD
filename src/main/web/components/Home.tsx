import React from "react";
import { AssetURL } from "../asset";
import MainBG from "./../public/assets/main-bg.jpg";

const Home = () => {
  return (
    <div>
      <img src={AssetURL.MAIN_BG.toString()}></img>
      Main page
    </div>
  );
};

export default Home;

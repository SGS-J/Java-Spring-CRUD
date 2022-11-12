export class AssetLoader {
  static readonly readAsset = (route: AssetURL): string => {
    return "/public/assets" + route;
  };
}

export enum AssetURL {
  MAIN_LOGO = "/download.png",
  MAIN_BG = "/main-bg.jpg",
}
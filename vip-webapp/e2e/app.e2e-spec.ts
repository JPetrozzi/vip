import { VipWebappPage } from './app.po';

describe('vip-webapp App', () => {
  let page: VipWebappPage;

  beforeEach(() => {
    page = new VipWebappPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});

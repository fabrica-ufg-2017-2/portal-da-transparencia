import { PortalInfPage } from './app.po';

describe('portal-inf App', () => {
  let page: PortalInfPage;

  beforeEach(() => {
    page = new PortalInfPage();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to app!');
  });
});

import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ExtensaoDashboardScreenComponent} from './extensao-dashboard.component';

describe('ExtensaoDashboardScreenComponent', () => {
  let component: ExtensaoDashboardScreenComponent;
  let fixture: ComponentFixture<ExtensaoDashboardScreenComponent>;

  beforeEach(
    async(() => {
      TestBed.configureTestingModule({
        declarations: [ExtensaoDashboardScreenComponent]
      }).compileComponents();
    })
  );

  beforeEach(() => {
    fixture = TestBed.createComponent(ExtensaoDashboardScreenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});

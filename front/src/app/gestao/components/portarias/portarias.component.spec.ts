import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PortariasComponent } from './portarias.component';

describe('PortariasComponent', () => {
  let component: PortariasComponent;
  let fixture: ComponentFixture<PortariasComponent>;

  beforeEach(
    async(() => {
      TestBed.configureTestingModule({
        declarations: [PortariasComponent]
      }).compileComponents();
    })
  );

  beforeEach(() => {
    fixture = TestBed.createComponent(PortariasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});

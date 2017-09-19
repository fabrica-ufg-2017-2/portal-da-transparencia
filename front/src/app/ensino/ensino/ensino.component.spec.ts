import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EnsinoComponent } from './ensino.component';

describe('EnsinoComponent', () => {
  let component: EnsinoComponent;
  let fixture: ComponentFixture<EnsinoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EnsinoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EnsinoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});

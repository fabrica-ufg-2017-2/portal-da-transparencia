import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GestaoComponent } from './gestao.component';

describe('GestaoComponent', () => {
  let component: GestaoComponent;
  let fixture: ComponentFixture<GestaoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GestaoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GestaoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});

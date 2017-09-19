import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ExtensaoComponent } from './extensao.component';

describe('ExtensaoComponent', () => {
  let component: ExtensaoComponent;
  let fixture: ComponentFixture<ExtensaoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ExtensaoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ExtensaoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});

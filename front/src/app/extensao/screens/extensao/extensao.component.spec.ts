import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ExtensaoScreenComponent } from './extensao.component';

describe('ExtensaoScreenComponent', () => {
  let component: ExtensaoScreenComponent;
  let fixture: ComponentFixture<ExtensaoScreenComponent>;

  beforeEach(
    async(() => {
      TestBed.configureTestingModule({
        declarations: [ExtensaoScreenComponent]
      }).compileComponents();
    })
  );

  beforeEach(() => {
    fixture = TestBed.createComponent(ExtensaoScreenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});

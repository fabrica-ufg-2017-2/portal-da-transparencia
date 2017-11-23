import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ProjetoScreenComponent } from './projeto.component';

describe('ProjetoScreenComponent', () => {
  let component: ProjetoScreenComponent;
  let fixture: ComponentFixture<ProjetoScreenComponent>;

  beforeEach(
    async(() => {
      TestBed.configureTestingModule({
        declarations: [ProjetoScreenComponent]
      }).compileComponents();
    })
  );

  beforeEach(() => {
    fixture = TestBed.createComponent(ProjetoScreenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});

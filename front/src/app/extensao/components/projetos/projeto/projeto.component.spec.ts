import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ProjetoComponent } from './projeto.component';

describe('ProjetoComponent', () => {
  let component: ProjetoComponent;
  let fixture: ComponentFixture<ProjetoComponent>;

  beforeEach(
    async(() => {
      TestBed.configureTestingModule({
        declarations: [ProjetoComponent]
      }).compileComponents();
    })
  );

  beforeEach(() => {
    fixture = TestBed.createComponent(ProjetoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});

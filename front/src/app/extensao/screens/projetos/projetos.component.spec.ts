import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ProjetosScreenComponent} from './projetos.component';

describe('ProjetosScreenComponent', () => {
  let component: ProjetosScreenComponent;
  let fixture: ComponentFixture<ProjetosScreenComponent>;

  beforeEach(
    async(() => {
      TestBed.configureTestingModule({
        declarations: [ProjetosScreenComponent]
      }).compileComponents();
    })
  );

  beforeEach(() => {
    fixture = TestBed.createComponent(ProjetosScreenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});

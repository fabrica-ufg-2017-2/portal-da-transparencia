import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GraficoSituacaoProjetosComponent } from './grafico-situacao-projetos.component';

describe('GraficoSituacaoProjetosComponent', () => {
  let component: GraficoSituacaoProjetosComponent;
  let fixture: ComponentFixture<GraficoSituacaoProjetosComponent>;

  beforeEach(
    async(() => {
      TestBed.configureTestingModule({
        declarations: [GraficoSituacaoProjetosComponent]
      }).compileComponents();
    })
  );

  beforeEach(() => {
    fixture = TestBed.createComponent(GraficoSituacaoProjetosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});

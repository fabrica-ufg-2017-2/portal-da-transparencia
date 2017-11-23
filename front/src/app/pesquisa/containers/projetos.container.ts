import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs/Observable';

import { ProjetosService } from './../services/projetos.service';
import { Projeto } from './../models/projeto.interface';

@Component({
  selector: 'inf-projetos-container',
  template: `
    <inf-grafico-situacao-projetos [pieChartLabels]="labels" [pieChartData]="dataGaph"></inf-grafico-situacao-projetos>
    <inf-projetos-pesquisa [projetos]="projetos"></inf-projetos-pesquisa>
  `
})
export class ProjetosContainerComponent implements OnInit {
  projetos: Array<Projeto>;

  private projetosAtivos: Array<string>;
  private projetosInativos: Array<string>;
  labels: Array<string>;
  dataGaph: Array<number>;
  private itensAtivos: number;
  private itensInativos: number;

  constructor(private projetosService: ProjetosService) {
    this.labels = ['Ativos', 'Inativos'];
    this.dataGaph = [0, 0];
    this.projetosAtivos = [];
    this.projetosInativos = [];
  }

  ngOnInit() {
    this.projetosService.getAll().subscribe(projetos => {
      // console.log(projetos);
      this.projetos = projetos;
      projetos.map(projeto => {
        // console.log(projeto.situacao);
        projeto.situacao === 'Em andamento'
          ? this.projetosAtivos.push(projeto.situacao)
          : this.projetosInativos.push(projeto.situacao);
      });
      // console.log(this.projetosAtivos);
      const itensAtivos = this.projetosAtivos.length;
      const itensInativos = this.projetosInativos.length;
      this.dataGaph = [itensAtivos, itensInativos];
      // console.log(this.dataGaph);
    });
  }
}

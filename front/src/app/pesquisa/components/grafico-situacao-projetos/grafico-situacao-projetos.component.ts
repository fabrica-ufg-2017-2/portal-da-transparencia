import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'inf-grafico-situacao-projetos',
  templateUrl: './grafico-situacao-projetos.component.html',
  styleUrls: ['./grafico-situacao-projetos.component.scss']
})
export class GraficoSituacaoProjetosComponent implements OnInit {
  @Input() pieChartLabels: Array<string>;
  @Input() pieChartData: Array<number>;

  constructor() {}

  ngOnInit() {}

  chartClicked(e: any): void {
    console.log(e);
  }

  chartHovered(e: any): void {
    console.log(e);
  }
}

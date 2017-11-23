export interface Portaria {
  id: number;
  numero: string;
  estado: string;
  resumo: string;
  dataEmissao: string;
  designados: Array<string>;
  url: string;
}

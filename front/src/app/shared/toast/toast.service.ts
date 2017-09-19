import { Injectable } from '@angular/core';
import toastr from 'toastr';

@Injectable()
export class ToastService {

  private options: any;

  constructor() {
    this.options = {
      "closeButton": true,
      "debug": false,
      "newestOnTop": false,
      "progressBar": false,
      "positionClass": "toast-top-center",
      "preventDuplicates": false,
      "onclick": null,
      "showDuration": "300",
      "hideDuration": "1000",
      "timeOut": "5000",
      "extendedTimeOut": "1000",
      "showEasing": "swing",
      "hideEasing": "linear",
      "showMethod": "fadeIn",
      "hideMethod": "fadeOut"
    }
  }

  sucesso(titulo: string, mensagem: string) {
    this.exibe('success', mensagem, titulo);
  }

  info(titulo: string, mensagem: string) {
    this.exibe('info', mensagem, titulo);
  }

  cuidado(mensagem: string, titulo: string) {
    this.exibe('warning', mensagem, titulo);
  }

  erro(titulo: string, mensagem: string) {
    this.exibe('error', mensagem, titulo);
  }

  private exibe(tipo: string, mensagem: string, titulo: string) {
    toastr.options = this.options;
    toastr[tipo](mensagem, titulo);
  }
}
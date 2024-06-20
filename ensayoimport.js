import dividir, { sumar,restar } from "./ensayoexport.js";
console.log(sumar(10,10));
console.log(restar(100,50));

//default
import { multi } from "./ensayoexport.js";
console.log(dividir(100/2));

//todo
import * as ensayoexport from"./ensayoexport.js";
console.log(ensayoexport.multi(5,2));
console.log(ensayoexport.potencia(5,2));


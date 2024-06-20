import {sumar, restar} from"./operaciones.js";
console.log(sumar(1,2));
console.log(restar(10,5));

//import (export default)
import producto from "./operaciones.js";
console.log(producto(3,3));

//importar todo import * as peraciones from ...
import * as operaciones from"./operaciones.js";
console.log(operaciones.multiplicacion(5,5,5));
console.log(operaciones.division(100,2));
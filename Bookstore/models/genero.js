var mongoose = require('mongoose');

//Schema
var generoSchema = mongoose.Schema({
  nombre:{
    type: String,
    required: true
  },
  fecha_creado:{
    type: Date,
    default: Date.now
  }
});

//Esto es para que el objeto pueda ser accedido desde fuera
var Genero = module.exports = mongoose.model('Genero', generoSchema);

//Metodos de acceso
module.exports.getGeneros = function(callback, limit){
  Genero.find(callback).limit(limit); //Como si estubiesemos en mongodb
}

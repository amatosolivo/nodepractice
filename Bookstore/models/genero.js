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

// Add Geero
module.exports.addGenero = function(genero, callback){
  Genero.create(genero, callback);
}

// Update Generos
module.exports.updateGenero = function(id, genero, options, callback){
  var query = {_id: id};
  var update = {
    nombre: genero.nombre
  };
  Genero.findOneAndUpdate(query, update, options, callback);
}

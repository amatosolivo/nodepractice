var mongoose = require('mongoose');

//Schema
var libroSchema = mongoose.Schema({
  titulo:{
    type: String,
    required: true
  },
  genero:{
    type: String,
    required: true
  },
  autor:{
    type: String,
    required: true
  },
  fecha_creado:{
    type: Date,
    default: Date.now
  }
});

//Esto es para que el objeto pueda ser accedido desde fuera
var Libro = module.exports = mongoose.model('Libro', libroSchema);

//Metodos de acceso

//Buscar todos los libros
module.exports.getLibros = function(callback, limit){
  Libro.find(callback).limit(limit);
}

//Buscar solo un libro
module.exports.getLibroPorId = function(id, callback){
  Libro.findById(id, callback);
}

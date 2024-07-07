package com.hemanth.io

//reading file
File file=new File("E:/Example.txt")
file.eachLine {
    line->println line
}
println file.text
//creating file and writing to file
File fileWrite=new File('E:/','ExampleWrite.txt')
fileWrite.withWriter("UTF-8"){
    writer->writer.writeLine 'Heello Hemanth'
}
//file size
println "the file ${fileWrite.absolutePath} has ${fileWrite.length()} bytes"
//deleting a file
fileWrite.delete()


#Printing n terms of a fibonacci series
puts "Enter the number"
n=gets
a=0
b=1
puts "The Fibonacci Series is"
puts a
puts b
for i in 2..Integer(n)-1 do
  c=a+b
  puts c
  a=b
  b=c
end


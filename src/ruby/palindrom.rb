# To Check Wheather the string is palindrom or not
puts "Enter a String"
a=gets.chomp
b=a.reverse
puts b
if a==b
  puts "The Given String is Palindrom"
else
  puts "The Given String is Not a Palindrom"
end

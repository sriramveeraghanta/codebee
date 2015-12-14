#Factorail of a Number
puts "Enter a Number"
n=gets
fact=1
if n==0
  puts "The Factorail of #{n} is 1"
else
  for i in 1..Integer(n) do
    fact=fact*i
  end
puts "The Factorail of #{n} is #{fact} "
end

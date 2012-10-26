--Up function

function up()

	turtle.up()
	turtle.up()
	turtle.digUp()
	turtle.up()
	turtle.up()
	turtle.select(1)
	turtle.placeDown()

end

--Down function

function down()

	turtle.digDown()
	turtle.down()
	turtle.down()
	turtle.select(1)
	turtle.placeUp()
	turtle.down()
	turtle.down()

end

--Was function

function wassen()

	rs.setOutput("front", true)
	rs.setOutput("back", false)
	rs.setBundledOutput("top", colors.orange)
	i=0
	repeat
		
		rs.setOutput("left", true)
		rs.setOutput("right", true)
		rs.setOutput("bottom", true)
		sleep(0.5)
		rs.setOutput("left", false)
		rs.setOutput("right", false)
		rs.setOutput("bottom", false)
		sleep(0.5)
		i=i+1

	until i==20

	sleep(3)
	rs.setBundledOutput("top", colors.white)
	i=0

	repeat
		
		rs.setOutput("left", true)
		rs.setOutput("right", true)
		rs.setOutput("bottom", true)
		sleep(0.5)
		rs.setOutput("left", false)
		rs.setOutput("right", false)
		rs.setOutput("bottom", false)
		sleep(0.5)
		i=i+1

	until i==25
		
	rs.setOutput("left", true)
	rs.setOutput("right", true)
	rs.setOutput("bottom", true)
	rs.setBundledOutput("top", 0)
	rs.setOutput("back", true)
	print("gelukt")

	end

--Code

print("Up or down?")
input = read()

if input=="Up" then
	up()
	print("Check")
elseif input=="Down" then
	down()
	print("Check")
elseif input=="Wassen" then
	up()
	wassen()
	print("Check")
elseif input=="Reset" then
	rs.setOutput("front", false)
	rs.setOutput("back", false)
	rs.setBundledOutput("top", 0)
	down()
	print("Check")

end

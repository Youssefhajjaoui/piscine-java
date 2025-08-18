new:
	@read -p "Enter exercise name: " name; \
	mkdir -p $$name; \
	echo "public class $$name {" > $$name/$$name.java; \
	echo "    // your code here" >> $$name/$$name.java; \
	echo "}" >> $$name/$$name.java; \
	echo "Created new exercise: $$name/$$name.java"


clean:
	@rm -rf build/*

# Target: make run pr=ExerciseName
run:
	@mkdir -p build
	@javac $(pr)/*.java ExerciseRunner.java -d build
	@java -cp build ExerciseRunner

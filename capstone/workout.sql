/*
-- Query: SELECT * FROM capstone_db.workout
LIMIT 0, 1000

-- Date: 2022-06-08 15:13
*/
INSERT INTO `user` (`user_id`,`username`) VALUES (1,'bdizzer');
INSERT INTO `user` (`user_id`,`username`) VALUES (2,'john123');
INSERT INTO `biometrics` (`age`,`first_name`,`height`,`last_name`,`weight`,`user_id`) VALUES (28,'brandon',95,'dykman',145,1);
INSERT INTO `biometrics` (`age`,`first_name`,`height`,`last_name`,`weight`,`user_id`) VALUES (18,'John',95,'Smith',200,2);
INSERT INTO `workout` (`workout_id`,`date`,`user_id`) VALUES (1,'1994-01-12',1);
INSERT INTO `workout` (`workout_id`,`date`,`user_id`) VALUES (2,'2022-01-19',2);
INSERT INTO `workout` (`workout_id`,`date`,`user_id`) VALUES (3,'2022-01-25',1);
INSERT INTO `exercise` (`exercise_id`,`distance`,`reps`,`sets`,`time`,`weight`,`exercise_type_exercise_type_id`) VALUES (1,1,10,3,1,40,1);
INSERT INTO `exercise` (`exercise_id`,`distance`,`reps`,`sets`,`time`,`weight`,`exercise_type_exercise_type_id`) VALUES (2,1,10,3,1,40,2);
INSERT INTO `exercise` (`exercise_id`,`distance`,`reps`,`sets`,`time`,`weight`,`exercise_type_exercise_type_id`) VALUES (3,1,10,3,1,40,2);
INSERT INTO `` (`exercise_type_id`,`exercise_name`) VALUES (1,'situps');
INSERT INTO `` (`exercise_type_id`,`exercise_name`) VALUES (2,'pushups');

<?php
$con=new mysqli("localhost","akasa123","311010121akasa","akasa");
if($con-> connect_error){
	echo "connect_error";
}else{
	echo "connection done";
}
?>
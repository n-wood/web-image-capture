<?php 
$upload_dir = "/tmp/";
$img = $_POST['savedImage'];
$fileName = $_POST['fileName'];
$img = str_replace('data:image/png;base64,', '', $img);
$img = str_replace(' ', '+', $img);
$data = base64_decode($img);
$file = $upload_dir.$fileName.".png";
$success = file_put_contents($file, $data);

?>
import time

from selenium import webdriver
from selenium.webdriver.common.by import By

chrome=webdriver.Chrome(executable_path="E:\SeleniumComponents\chromedriver (2).exe")
chrome.maximize_window()

chrome.get(url="https://www.fb.com")

email = chrome.find_element(By.CLASS_NAME,"inputtext")
email.send_keys("rrsalian16@gmail.com")
psw = chrome.find_element(By.CLASS_NAME,"inputtext")
psw.send_keys("12334")

time.sleep(5)
chrome.close()
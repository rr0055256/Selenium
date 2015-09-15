from selenium import webdriver

from selenium.webdriver.support.ui import WebDriverWait

from selenium.webdriver.support import expected_conditions as EC

driver = webdriver.Chrome("/usr/lib/chromium-browser/chromedriver")

driver.get("http://www.cricinfo.com")

driver.quit()